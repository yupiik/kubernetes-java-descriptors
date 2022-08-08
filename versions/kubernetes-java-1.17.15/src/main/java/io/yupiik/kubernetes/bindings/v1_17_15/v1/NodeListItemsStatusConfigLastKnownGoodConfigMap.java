package io.yupiik.kubernetes.bindings.v1_17_15.v1;

import java.util.Objects;

public class NodeListItemsStatusConfigLastKnownGoodConfigMap {
    private String kubeletConfigKey;
    private String name;
    private String namespace;
    private String resourceVersion;
    private String uid;

    public NodeListItemsStatusConfigLastKnownGoodConfigMap() {
        // no-op
    }

    public NodeListItemsStatusConfigLastKnownGoodConfigMap(final String kubeletConfigKey,
                                                           final String name,
                                                           final String namespace,
                                                           final String resourceVersion,
                                                           final String uid) {
        // no-op
    }

    public String getKubeletConfigKey() {
        return kubeletConfigKey;
    }

    public void setKubeletConfigKey(final String kubeletConfigKey) {
        this.kubeletConfigKey = kubeletConfigKey;
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

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                kubeletConfigKey,
                name,
                namespace,
                resourceVersion,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeListItemsStatusConfigLastKnownGoodConfigMap)) {
            return false;
        }
        final NodeListItemsStatusConfigLastKnownGoodConfigMap __otherCasted = (NodeListItemsStatusConfigLastKnownGoodConfigMap) __other;
        return Objects.equals(kubeletConfigKey, __otherCasted.kubeletConfigKey) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(uid, __otherCasted.uid);
    }
}
