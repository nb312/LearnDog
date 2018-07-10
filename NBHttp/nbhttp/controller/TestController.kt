

class TestController : BaseController(), ITestController {
    override fun test(iConfig: IConfig) {
        var serviceCreator = BaseServiceCreator(iConfig.testParam)
        var service = serviceCreator.createService(ITestService::class.java)
        addDisposable(serviceCreator.onSubscribe(service.test(iConfig.testParam.time), TestConfigCallBack(iConfig)))
    }
}

