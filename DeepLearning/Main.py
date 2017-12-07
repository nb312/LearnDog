# -*- coding: utf-8 -*-
import numpy as np


class Network(object):
    
    def __init__(self,sizes):
        """random is the object that can product random num with special rule.
        the function 'randn()' can product the random number from 1 to x as an array """
        self.num_layers = len(sizes)
        self.sizes = sizes
        self.biases = [np.random.randn(y,1) for y in sizes[1:]]
        self.weights = [np.random.randn(y,x) for x, y in zip(sizes[:-1],sizes[1:])]

    def sigmoid(self,z):
        """"this is represent the activation function"""
        return 1.0/(1.0+np.exp(-z))

    def feedForward(self,a):
         """this is forward network that a input the out"""
         for b,w in zip(self.biases,self.weights):
             a = self.sigmoid(np.dot(w,a)+b)
         return a

    def SGD(self,training_data,epochs,mini_batch_size,eta,test_data=None):
         """training_data: the input data represents the (x,y) of tuples,x is input and y is the desired out
            epochs: the iterator's time of the batch.a
         """
         if test_data : n_test = len(test_data)
         n = len(training_data) # the input data's length
         for j in range(epochs): #
             np.random.shuffle(training_data)# random the data then maybe have the different effect
             mini_batches = [training_data[k:k+mini_batch_size] for k in range(0,n,mini_batch_size)]# start,stop,step
             for mini_batch in mini_batches:
                 print("")

    def update_mini_batch(self,mini_batch,eta):
        """"update the biases and weights with only a mini_batch.
        1. create a array with the same shape of biases and weights and set the values to zero.
        2.
        """
        nabla_b=[np.zeros(b.shape) for b in self.biases]
        nabla_w=[np.zeros(w.shape) for w in self.weights]
        for x,y in mini_batch:
            print("")



# =======================TEST LETS GO=========================================
net = Network([2, 3, 1])
print("biases=",net.biases)
print("weights=",net.weights)
for b in net.biases:
    print("shape=",b.shape)
# =============================================================================
