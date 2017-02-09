class TestController {
  static layout = 'main'
  def get() {
    [v: Test.findByKey(params.id as int)]
  }
}
