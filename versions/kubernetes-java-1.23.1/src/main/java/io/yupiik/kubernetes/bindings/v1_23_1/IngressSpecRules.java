package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.Objects;

public class IngressSpecRules {
    private String host;
    private IngressSpecRulesHttp http;

    public IngressSpecRules() {
        // no-op
    }

    public IngressSpecRules(final String host,
                            final IngressSpecRulesHttp http) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public IngressSpecRulesHttp getHttp() {
        return http;
    }

    public void setHttp(final IngressSpecRulesHttp http) {
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
        if (!(__other instanceof IngressSpecRules)) {
            return false;
        }
        final IngressSpecRules __otherCasted = (IngressSpecRules) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(http, __otherCasted.http);
    }
}
