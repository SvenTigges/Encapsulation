public class Test {

private String testStr = "Hallo";


// Getter 
public String getTestStr() {
  if (this.hasPermisson()) {
    return testStr;
  } else {
      return "Sorry, no permission!";
  }  
}

// Setter 
public void setTestStr(String testStr) {
    this.testStr = testStr;
} 
 private boolean hasPermisson() {
     return false; 
 }
    
}
