package io.yupiik.kubernetes.bindings.v1_14_0.v1beta1;

import java.util.Objects;

public class MutatingWebhookConfigurationWebhooksClientConfigService {
    private String name;
    private String namespace;
    private String path;

    public MutatingWebhookConfigurationWebhooksClientConfigService() {
        // no-op
    }

    public MutatingWebhookConfigurationWebhooksClientConfigService(final String name,
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
        if (!(__other instanceof MutatingWebhookConfigurationWebhooksClientConfigService)) {
            return false;
        }
        final MutatingWebhookConfigurationWebhooksClientConfigService __otherCasted = (MutatingWebhookConfigurationWebhooksClientConfigService) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(path, __otherCasted.path);
    }
}
