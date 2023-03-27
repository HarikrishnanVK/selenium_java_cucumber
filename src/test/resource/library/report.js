$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BupaWhereAreYou.feature");
formatter.feature({
  "line": 1,
  "name": "Bupa where you are module",
  "description": "",
  "id": "bupa-where-you-are-module",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Regressionm5"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@WhereYouAre"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"\u003cpage\u003e\" login page of \"\u003cenv\u003e\" using \"\u003cbrowser\u003e\" browser on \"\u003cdevice\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"\u003ccountrytext\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"\u003cenv\u003e\" of \"\u003cextensionUrl\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;",
  "rows": [
    {
      "cells": [
        "page",
        "env",
        "browser",
        "device",
        "extensionUrl",
        "countrytext"
      ],
      "line": 10,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;1"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "UnitedkingdomPage",
        "United Kingdom"
      ],
      "line": 11,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;2"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "AustraliaPage",
        "Australia"
      ],
      "line": 12,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;3"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "ChilePage",
        "Chile"
      ],
      "line": 13,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;4"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "ChinaPage",
        "China"
      ],
      "line": 14,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;5"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "HongkongPage",
        "Hong Kong SAR"
      ],
      "line": 15,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;6"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "IndiaPage",
        "India"
      ],
      "line": 16,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;7"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "NewzealandPage",
        "New Zealand"
      ],
      "line": 17,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;8"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "PolandPage",
        "Poland"
      ],
      "line": 18,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;9"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "SaudiarabiaPage",
        "Saudi Arabia"
      ],
      "line": 19,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;10"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "SpainPage",
        "Spain"
      ],
      "line": 20,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;11"
    },
    {
      "cells": [
        "where you are",
        "RegressionUI",
        "config",
        "config",
        "WorldwidePage",
        "Worldwide"
      ],
      "line": 21,
      "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;12"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"United Kingdom\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"UnitedkingdomPage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 20473181200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 2772773600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "UnitedkingdomPage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 60325100,
  "status": "passed"
});
formatter.after({
  "duration": 3495020000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"Australia\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"AustraliaPage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 11033537000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 4356324200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "AustraliaPage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 44117200,
  "status": "passed"
});
formatter.after({
  "duration": 3375660400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"Chile\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"ChilePage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 15958502800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chile",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 2688566700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "ChilePage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 19441600,
  "status": "passed"
});
formatter.after({
  "duration": 2851057300,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"China\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"ChinaPage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 14164149300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "China",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 2583258100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "ChinaPage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 7523300,
  "status": "passed"
});
formatter.after({
  "duration": 2784850400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"Hong Kong SAR\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"HongkongPage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 9494400000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hong Kong SAR",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 215746000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "HongkongPage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 2280369900,
  "status": "passed"
});
formatter.after({
  "duration": 2806179700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"India\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"IndiaPage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 8566266200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 1407231600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "IndiaPage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 8271300,
  "status": "passed"
});
formatter.after({
  "duration": 2684229400,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"New Zealand\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"NewzealandPage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 8667157700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Zealand",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 2180797100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "NewzealandPage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 11755500,
  "status": "passed"
});
formatter.after({
  "duration": 2761026800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;9",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"Poland\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"PolandPage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 8131910200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Poland",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 1607613100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "PolandPage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 10348500,
  "status": "passed"
});
formatter.after({
  "duration": 3521879400,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;10",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"Saudi Arabia\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"SaudiarabiaPage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 8723642300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Saudi Arabia",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 1742217400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "SaudiarabiaPage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 6812400,
  "status": "passed"
});
formatter.after({
  "duration": 2708980600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;11",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"Spain\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"SpainPage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 7767245100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Spain",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 1633331200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "SpainPage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 8493400,
  "status": "passed"
});
formatter.after({
  "duration": 3093592400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "To verify user interest for the countries",
  "description": "",
  "id": "bupa-where-you-are-module;to-verify-user-interest-for-the-countries;;12",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@WhereYouAre"
    },
    {
      "line": 3,
      "name": "@RegressionUIm5"
    },
    {
      "line": 3,
      "name": "@Regressionm5"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the \"where you are\" login page of \"RegressionUI\" using \"config\" browser on \"config\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on country using \"Worldwide\"",
  "matchedColumns": [
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be navigated to the \"RegressionUI\" of \"WorldwidePage\"",
  "matchedColumns": [
    1,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "where you are",
      "offset": 13
    },
    {
      "val": "RegressionUI",
      "offset": 43
    },
    {
      "val": "config",
      "offset": 64
    },
    {
      "val": "config",
      "offset": 84
    }
  ],
  "location": "HomPageSteps.i_am_on_the_login_page_of_using_browser_on(String,String,String,String)"
});
formatter.result({
  "duration": 9929953800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Worldwide",
      "offset": 26
    }
  ],
  "location": "BupaWhereYouAreSteps.i_click_on_country_using(String)"
});
formatter.result({
  "duration": 1726246600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RegressionUI",
      "offset": 30
    },
    {
      "val": "WorldwidePage",
      "offset": 48
    }
  ],
  "location": "BupaWhereYouAreSteps.i_should_be_navigated_to_the_of(String,String)"
});
formatter.result({
  "duration": 12453500,
  "status": "passed"
});
formatter.after({
  "duration": 2745376900,
  "status": "passed"
});
});