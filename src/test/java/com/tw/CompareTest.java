package com.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CompareTest {
    @Test
    public void shouldReturnTrueIfBothValuesAreOne(){
        Compare obj1=new Compare(1);
        Compare obj2=new Compare(1);
        assertThat(obj1.compareValues(obj1,obj2),is(equalTo(true)));
    }

}

