package org.mayanjun.core;

/**
 * @author mayanjun
 * @since 2018/7/9
 */
public interface Parser<I, O> {

    /**
     * Parse input message and return a result represented by O object
     * @param input input message to be parsed
     * @return Parse result represented by O object or null if parse error
     * @throws ServiceException
     */
    O parse(I input) throws ServiceException;

}
