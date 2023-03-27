Feature: BupaSplashUI 

@Regression1 @RegressionUIm5 @SplashPage 
Scenario Outline: To verify welcome page 

	Given  I am on the "<page>" login page of "<env>" using "<browser>" browser on "<device>" 
	Then   I should be navigated to the "<env>" of "<extensionUrl>" for splash page 
	
	Examples: 
		| page        | env          | browser | device | extensionUrl |
		| bupasplash  | RegressionUI | config  | config | BupaSplash   |
		
@DirectUIValidation @firefoxUI @SitemapDirectUIValidation @Regression
Scenario Outline: To verify Sitemap Landing page has the tree structure displayed
Given  I am on the "<page>" login page of "<env>" using "<browser>" browser on "<device>"
And    I get the "ExpectedData" from Excel "<columnName>" , "<sheetName>" , "<DataFileName>"    
Then   I get the "TreeStructure" under Sitemap Page of "<pagename>"
And    I should see that the Tree structure are displayed appropriately

Examples:
| page         | env          | browser2 | device2  | pagename           | columnName         | sheetName             | DataFileName     |
| sitemap page | RegressionUI | config   | config   | Bupa where you are | Bupa where you are | SitemapTreestructure  | ExpectedControls |
| sitemap page | RegressionUI | config   | config   | Legal notices      | Legal notices      | SitemapTreestructure  | ExpectedControls |
| sitemap page | RegressionUI | config   | config   | What we do         | What we do         | SitemapTreestructure  | ExpectedControls |
| sitemap page | RegressionUI | config   | config   | Who we are         | Who we are         | SitemapTreestructure  | ExpectedControls |
| sitemap page | RegressionUI | config   | config   | Contacts           | Contacts           | SitemapTreestructure  | ExpectedControls |
| sitemap page | RegressionUI | config   | config   | Our performance    | Our performance    | SitemapTreestructure  | ExpectedControls |
| sitemap page | RegressionUI | config   | config   | Jobs               | Jobs               | SitemapTreestructure  | ExpectedControls |

