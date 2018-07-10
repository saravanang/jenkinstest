node() {
    print "From SCM"
   stage ("Checkout") {
       
       git url: 'https://github.com/ksubbarao/Beach-resort.git' 
       sh "ls -ltr"
       
   }
   
   stage ("Compile") {
       
   }
   
   stage ("Code Analysis"){
       
   }
   
   stage ("Unit Test"){
       
   }
   
   stage ("Package") {
       
   }
   
   stage ("Upload Binary") {
       
   }
   
   print "End of CI"
   
   stage ("Download Binary") {
       
   }
}
