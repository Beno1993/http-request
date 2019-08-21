package com.jsunsoft.http;

/* Copyrights 2006 Energize Global Services
 * Date: 8/21/2019.
 * Developer: Beno Arakelyan
 * This software is the proprietary information of Energize Global Services.
 * Its use is subject to License terms.
 */


import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface RetryContext {
    int getRetryCount();

    default List<Predicate<Response>> retryPredicate() {
        return Collections.emptyList();
    }

    default List<Consumer<WebTarget>> getBeforeRetryConsumers() {
        return Collections.emptyList();
    }
}
