node(){
  
  stage "checkout"
    print "In Checkout"
  stage "compile"
  stage "code analysis"
  stage "package"
  stage "upload"
  stage "download"
  stage "deploy"
  stage "restart"
  stage "finish"
}
