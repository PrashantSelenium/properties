package ru.qatools.properties.testdata;

import ru.qatools.properties.converters.StringConverter;

/**
 * @author Artem Eroshenko eroshenkoam
 *         5/13/13, 11:07 PM
 */
public class UpperCaseStringConverter extends StringConverter {

    @Override
    public String convert(String from) throws Exception {
        return super.convert(from.toUpperCase());
    }
}
