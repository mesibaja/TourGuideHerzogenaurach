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
     * Image resource ID for the Category
     */
    private int mImageResourceId;

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
     * Create a new Herzo object.
     *
     * @param SubCategory  is the subcategory
     * @param MainCategory is main category
     * @param ImageResourceId is the drawable resource ID for the image associated with the categories
     */
    public Herzo(String SubCategory, String MainCategory, int ImageResourceId) {
        mSubCategory = SubCategory;
        mMainCategory = MainCategory;
        mImageResourceId = ImageResourceId;
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

    /**
     * Return the image resource ID of the category.
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }
}