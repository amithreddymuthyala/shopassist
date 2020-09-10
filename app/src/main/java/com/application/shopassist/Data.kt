package com.application.shopassist

import com.application.shopassist.database.models.DataModel

object Data {
    var items = arrayListOf(
        DataModel(
            "Q1)  How do I create a new shopping list?",
            "A1) After launching the application click on Shopping list > plus button > Give a name to your shopping list > click on create button."
        ),
        DataModel(
            "Q2) How do I delete a shopping list?",
            "A2) after launching the application, click on Shopping list, you will see all your shopping list \uF0E0 click delete icon."
        ),
        DataModel(
            "Q3) How do I compare the price of a single item?",
            "A3) Click on shopping list> click create shopping list> click item catalog to view the product name> select a product> click on price comparison."
        ),
        DataModel(
                "Q4) How do I use barcode scanner to compare price across various retailers?",
        "A4) Launch application> click on barcode scanner> keep your product ready> aim the camera at the product> let the scanner detect the product> click on price comparisons."
        ),
        DataModel(
            "Q5) How do I add an item to favorites?",
            "A5) After comparing price> click on add to favorites "
        ),
        DataModel(
            "Q6) How do I delete an item from favorites?",
            "A6) Launch the application> click on favorites icon at the bottom of the screen, select the list/product you want to delete > click on delete icon"
        ),
        DataModel(
            "Q7) Do I need internet connectivity to use Shop Assist?",
            "A7) To view your grocery list or your favorite products, you don’t need internet connectivity but to check the price of products or to add any product to fav list, you need to have internet connectivity."
        ),
        DataModel(
            "Q8) How many megapixel camera do I need to use to scan the barcode of a product?",
            "A8) Any camera having a megapixel 5 or above can be used to scan the barcode of a product"
        ),
        DataModel(
            "Q9) What do I need to do if the application takes a lot of time to compare price?",
            "A9) Please contact us on support@shopassit.com for any concerns regarding the performance of the application. We will be happy to assist you."
        )





    )
}