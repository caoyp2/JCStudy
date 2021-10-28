package org.example.junit4;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({
        junit4demo.class,
        junit4_paramter.class
})
//@Categories.IncludeCategory(MockTest.class) #仅执行包含@Category(MockTest.class)标识的用例
@Categories.ExcludeCategory(MockTest.class) //不执行包含@Category(MockTest.class)标识的用例
public class junit4_categories {


}
