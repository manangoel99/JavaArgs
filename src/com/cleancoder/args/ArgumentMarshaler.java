package com.cleancoder.args;

import java.util.Iterator;

/**
 * <h1>Argument Marshaler</h1>
 * <p>
 * The Argument Marshaler class is used as a parent
 * class from which marshalers for each kind of 
 * argument are extended. 
 * </p>
 * 
 * @author  Manan Goel
 * @version 1.0
 */
public interface ArgumentMarshaler {
void set(Iterator<String> currentArgument) throws ArgsException;
}
