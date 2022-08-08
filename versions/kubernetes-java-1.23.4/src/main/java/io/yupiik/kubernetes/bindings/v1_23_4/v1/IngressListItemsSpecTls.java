package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.List;
import java.util.Objects;

public class IngressListItemsSpecTls {
    private List<String> hosts;
    private String secretName;

    public IngressListItemsSpecTls() {
        // no-op
    }

    public IngressListItemsSpecTls(final List<String> hosts,
                                   final String secretName) {
        // no-op
    }

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(final List<String> hosts) {
        this.hosts = hosts;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(final String secretName) {
        this.secretName = secretName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hosts,
                secretName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressListItemsSpecTls)) {
            return false;
        }
        final IngressListItemsSpecTls __otherCasted = (IngressListItemsSpecTls) __other;
        return Objects.equals(hosts, __otherCasted.hosts) &&
            Objects.equals(secretName, __otherCasted.secretName);
    }
}
