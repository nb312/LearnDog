
class TestConfigCallBack(var iConfig: IConfig) : NBaseCallback<String>() {
    override fun onSuccessState(baseResponse: BaseResponse<String>) {
        iConfig.onTestSuccess(baseResponse.body)
    }

    override fun onError(err: String) {
        iConfig.onTestError(err)
    }
}