package io.yupiik.kubernetes.bindings.v1_22_7.v1;

import io.yupiik.kubernetes.bindings.v1_22_7.Validable;
import io.yupiik.kubernetes.bindings.v1_22_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConfigMapNodeConfigSource implements Validable<ConfigMapNodeConfigSource> {
    private String kubeletConfigKey;
    private String name;
    private String namespace;
    private String resourceVersion;
    private String uid;

    public ConfigMapNodeConfigSource() {
        // no-op
    }

    public ConfigMapNodeConfigSource(final String kubeletConfigKey,
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
        if (!(__other instanceof ConfigMapNodeConfigSource)) {
            return false;
        }
        final ConfigMapNodeConfigSource __otherCasted = (ConfigMapNodeConfigSource) __other;
        return Objects.equals(kubeletConfigKey, __otherCasted.kubeletConfigKey) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(namespace, __otherCasted.namespace) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public ConfigMapNodeConfigSource kubeletConfigKey(final String kubeletConfigKey) {
        this.kubeletConfigKey = kubeletConfigKey;
        return this;
    }

    public ConfigMapNodeConfigSource name(final String name) {
        this.name = name;
        return this;
    }

    public ConfigMapNodeConfigSource namespace(final String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ConfigMapNodeConfigSource resourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public ConfigMapNodeConfigSource uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public ConfigMapNodeConfigSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (kubeletConfigKey == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kubeletConfigKey", "kubeletConfigKey",
                "Missing 'kubeletConfigKey' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (namespace == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "namespace", "namespace",
                "Missing 'namespace' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
