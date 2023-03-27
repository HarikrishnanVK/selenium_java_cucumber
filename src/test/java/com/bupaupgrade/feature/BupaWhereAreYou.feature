Feature: Bupa where you are module

@Regressionm5 @RegressionUIm5 @WhereYouAre
Scenario Outline:To verify user interest for the countries
Given  I am on the "<page>" login page of "<env>" using "<browser>" browser on "<device>" 
When   I click on country using "<countrytext>"
Then   I should be navigated to the "<env>" of "<extensionUrl>"

Examples: 
| page          | env          | browser | device  | extensionUrl      | countrytext    |
| where you are | RegressionUI | config  | config  | UnitedkingdomPage | United Kingdom |
| where you are | RegressionUI | config  | config  | AustraliaPage     | Australia      |
| where you are | RegressionUI | config  | config  | ChilePage         | Chile          |
| where you are | RegressionUI | config  | config  | ChinaPage         | China          |
| where you are | RegressionUI | config  | config  | HongkongPage      | Hong Kong SAR  |
| where you are | RegressionUI | config  | config  | IndiaPage         | India          |
| where you are | RegressionUI | config  | config  | NewzealandPage    | New Zealand    |
| where you are | RegressionUI | config  | config  | PolandPage        | Poland         |
| where you are | RegressionUI | config  | config  | SaudiarabiaPage   | Saudi Arabia   |
| where you are | RegressionUI | config  | config  | SpainPage         | Spain          |
| where you are | RegressionUI | config  | config  | WorldwidePage     | Worldwide      |
