package com.simple.gof.iterator;

import java.util.Objects;
import java.util.function.Consumer;
/**
 * Java8����������
 * @author chaozai
 * @date 2018��8��22��
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
