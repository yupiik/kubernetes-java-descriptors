package io.yupiik.kubernetes.bindings.v1_18_10;

import java.util.Objects;

public class IngressListItemsSpecRules {
    private String host;
    private IngressListItemsSpecRulesHttp http;

    public IngressListItemsSpecRules() {
        // no-op
    }

    public IngressListItemsSpecRules(final String host,
                                     final IngressListItemsSpecRulesHttp http) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public IngressListItemsSpecRulesHttp getHttp() {
        return http;
    }

    public void setHttp(final IngressListItemsSpecRulesHttp http) {
        this.http = http;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                http);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsSpecRules)) {
            return false;
        }
        final IngressListItemsSpecRules __otherCasted = (IngressListItemsSpecRules) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(http, __otherCasted.http);
    }
}
