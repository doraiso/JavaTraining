package org.junit;

public @interface Test {

    Class<IllegalArgumentException> expected();

}
