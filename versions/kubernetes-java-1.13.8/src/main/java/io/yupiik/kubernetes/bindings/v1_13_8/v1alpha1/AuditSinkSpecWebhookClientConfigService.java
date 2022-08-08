package io.yupiik.kubernetes.bindings.v1_13_8.v1alpha1;

import java.util.Objects;

public class AuditSinkSpecWebhookClientConfigService {
    private String name;
    private String namespace;
    private String path;

    public AuditSinkSpecWebhookClientConfigService() {
        // no-op
    }

    public AuditSinkSpecWebhookClientConfigService(final String name,
                                                   final String namespace,
                                                   final String path) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                namespace,
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AuditSinkSpecWebhookClientConfigService)) {
            return false;
        }
        final AuditSinkSpecWebhookClientConfigService __otherCasted = (AuditSinkSpecWebhookClientConfigService) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(path, __otherCasted.path);
    }
}
