# this is test for network

import random
import numpy as np

class NetWork(object):
      """
      This is test for the network
          1. Initialize the network,the __init__ function.
          2. Previously propagation and back propagation with the mini batch,then return the derivative of w and b.
          3. Use the random data with gradient function to compute the weights and biases.
      """

      def __init__(self,sizes):
          """
          Initialize the network with the num,sizes,weights and biases.
          num_lays: the network's layer number.
          sizes: the layers of the network.
          weights: the weights matrix of the network.
          biases: the biases matrix of the network.
          random.randn(): product a matrix with x rows and y columns.
          zip(): circle the array in parallel as the same time.
          sizes[:-1]: the array except the last one.
          sizes[1:]: the array begin at the second one.
          """
          self.num_lays = len(sizes)
          self.sizes = sizes
          self.weights = [np.random.randn(x,y) for x,y in zip(sizes[:-1],sizes[1:])]
          self.biases = [np.random.randn(x,1) for x in sizes[1:]]

      def calculate_derivative_w_b(self,x,y):
          """calculate the derivative of the weights and biases by the back propagation.
          1. Create a temp for the weights and biases with  the values of zero.
          2. Calculate the previously propagation of the network that its values are weighted input and export.
          3. Calculate the error,derivative weight,derivative bias in the last layers.
          4. Use the back propagation to calculate the derivatives of the weights and biases in the layers.
          """
          # step 1
          der_w = [np.zeros(w.shape) for w in self.weights]
          der_b = [np.zeros(b.shape) for b in self.biases]

          # step 2
          a_l = x # a_l is the representation of the lay export ,the first layer is the x.
          a_all = [x] # a_all is the array to store the all layers' export, the first layer is the x.
          z_all=[] # z_all is the array of the layers' weighted input, the first layer is empty.

          for w,b in zip(self.weights,self.biases):
              z_l = np.dot(w,a_l)+b # the weighted input
              z_all.append(z_l)
              a_l = sigmoid(z_l)
              a_all.append(a_l)

          # step 3
          delta_l = cost_derivative(a_l,y)*sigmoid_derivative(z_all[-1])
          der_b[-1] = delta_l
          der_w[-1] = a_all[-2]*delta_l

          for l in range(2,self.num_lays):
              delta_l = np.dot(np.transpose(self.weights[-l+1]),delta_l)*sigmoid_derivative(z_all[-l])
              der_b[-l] = delta_l
              der_w[-l] =np.dot(a_all[-l-1],delta_l)
          return der_w,der_b


      def update_mini_batch(self,mini_batch,eta):
          """
          1. Compute the sum derivative of the w,b.
          2. Use the derivative of the w,b to update the weights and biases.
          """
          init_w = [np.zeros(w.shape) for w in self.weights]
          init_b = [np.zeros(b.shape) for b in self.biases]

          for x,y in mini_batch:
              der_w,der_b = self.calculate_derivative_w_b(x,y)
              init_w=[w+nw for w,nw in zip(init_w,der_w)]
              init_b=[b+nb for b,nb in zip(init_b,der_b)]
          self.weights = [ w-eta/len(mini_batch)*nw for w,nw in zip(self.weights,init_w)]
          self.biases = [b- eta/len(mini_batch)*nb for b,nb in zip(self.biases,init_b)]


      def main_process(self,training_data,epoch,mini_size,eta,test_data):
          """The main of the process.
          1. Create a circle with  times of epoch.
          2. Disrupt the data of training by shuffle() function.
          3. Use the mini_size count to split the data of training into mini_batches.
          4. Traverse the mini_batches then use the mini_batch to update the weights and biases.
          5. Evaluate the weights and biases use the test_data
          """
          for time in range(epoch):
              np.random.shuffle(training_data)
              n = len(training_data)
              mini_batches=[ training_data[k:mini_size] for k in range(0,n,mini_size)]
              for mini_batch in mini_batches:
                  self.update_mini_batch(mini_batch,eta)
              if test_data:
                  print("Evaluate the function we use",self.evaluate(test_data))
              else:
                  print("Complete epoch at ",time)

      def feedPropagation(self,x):
          """
          This is previously propagation function that compute the export.
          """
          a=x
          for w,b in zip(self.weights,self.biases):
              a=sigmoid(np.dot(w,a)+b)
          return a

      def evaluate(self,test_data):
          """
          Evaluate the accuracy of the model.
          """
          test_result = [(np.argmax(self.feedPropagation(x)),y) for x,y in test_data]
          return sum(int(x==y) for x,y in test_result )



def sigmoid(z):
    """
    This is the sigma function to calculate the export of the neuron.
    Be careful about the float numbers.
    param z: the weighted input
    return: the export
    """
    return 1.0 / (1.0 + np.exp(-z))

def sigmoid_derivative(z):
    """
    Calculate the derivative of the sigmoid function.
    """
    return sigmoid(z)*(1-sigmoid(z)) # This is the infer in the article, but the direct calculate formula is np.exp(-z)/np.square(1.0+np.exp(-z),they are same with the result.

def cost_derivative(a,y):
    """
    We use the square function as the cost function then we have the formula below.This maybe have some many types but we use the one of them.
    """
    return a-y
