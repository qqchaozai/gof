package com.simple.gof.iterator;

import java.util.Objects;
import java.util.function.Consumer;
/**
 * Java8迭代器拷贝
 * @author chaozai
 * @date 2018年8月22日
 *
 * @param <E>
 */
public interface Iterator<E> {
    
    boolean hasNext();

    E next();

    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }
}
