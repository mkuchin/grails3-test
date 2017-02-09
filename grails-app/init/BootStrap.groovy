class BootStrap {

    def init = { servletContext ->
       new Test(key: 1, value: 'value').save()
    }
    def destroy = {
    }
}
