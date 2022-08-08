package io.yupiik.kubernetes.bindings.v1_14_2.v1beta1;

import java.util.Objects;

public class ValidatingWebhookConfigurationWebhooksClientConfigService {
    private String name;
    private String namespace;
    private String path;

    public ValidatingWebhookConfigurationWebhooksClientConfigService() {
        // no-op
    }

    public ValidatingWebhookConfigurationWebhooksClientConfigService(final String name,
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
        if (!(__other instanceof ValidatingWebhookConfigurationWebhooksClientConfigService)) {
            return false;
        }
        final ValidatingWebhookConfigurationWebhooksClientConfigService __otherCasted = (ValidatingWebhookConfigurationWebhooksClientConfigService) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(path, __otherCasted.path);
    }
}
