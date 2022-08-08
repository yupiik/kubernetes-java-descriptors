package io.yupiik.kubernetes.bindings.v1_21_9;

import java.util.Objects;

public class MutatingWebhookConfigurationListItemsWebhooksClientConfigService {
    private String name;
    private String namespace;
    private String path;
    private Integer port;

    public MutatingWebhookConfigurationListItemsWebhooksClientConfigService() {
        // no-op
    }

    public MutatingWebhookConfigurationListItemsWebhooksClientConfigService(final String name,
                                                                            final String namespace,
                                                                            final String path,
                                                                            final Integer port) {
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

    public Integer getPort() {
        return port;
    }

    public void setPort(final Integer port) {
        this.port = port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                namespace,
                path,
                port);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof MutatingWebhookConfigurationListItemsWebhooksClientConfigService)) {
            return false;
        }
        final MutatingWebhookConfigurationListItemsWebhooksClientConfigService __otherCasted = (MutatingWebhookConfigurationListItemsWebhooksClientConfigService) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port);
    }
}
