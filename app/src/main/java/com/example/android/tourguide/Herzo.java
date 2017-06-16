package com.example.android.tourguide;

/**
 * Created by petra on 2017.06.15..
 */


/**
 * {@link Herzo} represents information about Herzogenaurach.
 * It contains a main and subcategory.
 */

public class Herzo {

    /**
     * Main Category
     */
    private String mMainCategory;

    /**
     * Sub Category
     */
    private String mSubCategory;

    /**
     * Create a new Herzo object.
     *
     * @param SubCategory  is the subcategory
     * @param MainCategory is main category
     */
    public Herzo(String SubCategory, String MainCategory) {
        mSubCategory = SubCategory;
        mMainCategory = MainCategory;
    }

    /**
     * Get the subcategory of each main category.
     */
    public String getmSubCategory() {
        return mSubCategory;
    }

    /**
     * Get the main category of each main menu.
     */
    public String getmMainCategory() {
        return mMainCategory;
    }

}
