package io.yupiik.kubernetes.bindings.v1_8_15.v1beta1;

import io.yupiik.kubernetes.bindings.v1_8_15.Validable;
import io.yupiik.kubernetes.bindings.v1_8_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngressTLS implements Validable<IngressTLS> {
    private List<String> hosts;
    private String secretName;

    public IngressTLS() {
        // no-op
    }

    public IngressTLS(final List<String> hosts,
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
        if (!(__other instanceof IngressTLS)) {
            return false;
        }
        final IngressTLS __otherCasted = (IngressTLS) __other;
        return Objects.equals(hosts, __otherCasted.hosts) &&
            Objects.equals(secretName, __otherCasted.secretName);
    }

    public IngressTLS hosts(final List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public IngressTLS secretName(final String secretName) {
        this.secretName = secretName;
        return this;
    }

    @Override
    public IngressTLS validate() {
        return this;
    }
}
