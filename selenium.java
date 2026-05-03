// 1. Setup: Get the keys to the car
WebDriver driver = new ChromeDriver(); //main

// 2. Navigation: Drive to the store
//driver.get("https://www.google.com");
driver.get("https://www.google.com.au");//changed url to au via feature 2

// 3. Verification: Check if we arrived at the right place
String title = driver.getTitle();
System.out.println("Page title is: " + title);

// 4. Cleanup: Park the car and turn off the engine
driver.quit();