$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Checkout.feature");
formatter.feature({
  "name": "Place the order for Products",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search Experience for product search in both home and Offers page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PlaceOrder"
    }
  ]
});
formatter.step({
  "name": "User is on GreenCart Landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "user searched with Shortname \"\u003cName\u003e\" and extracted actual name of product",
  "keyword": "When "
});
formatter.step({
  "name": "Added \"3\" items of the selected product to cart",
  "keyword": "And "
});
formatter.step({
  "name": "User proceeds to Checkout and validate the \"\u003cName\u003e\" items in checkout page",
  "keyword": "Then "
});
formatter.step({
  "name": "verify user has ability to enter promo code and place the order",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name"
      ]
    },
    {
      "cells": [
        "Tom"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search Experience for product search in both home and Offers page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PlaceOrder"
    }
  ]
});
formatter.step({
  "name": "User is on GreenCart Landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_is_on_GreenCart_Landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user searched with Shortname \"Tom\" and extracted actual name of product",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageStepDefinition.user_searched_with_Shortname_and_extracted_actual_name_of_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Added \"3\" items of the selected product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutPageStepDefinition.added_items_of_the_selected_product_to_cart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User proceeds to Checkout and validate the \"Tom\" items in checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutPageStepDefinition.user_proceeds_to_Checkout_and_validate_the_items_in_checkout_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "verify user has ability to enter promo code and place the order",
  "keyword": "And "
});
formatter.match({
  "location": "CheckoutPageStepDefinition.verify_user_has_ability_to_enter_promo_code_and_place_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});