package io.yupiik.kubernetes.bindings.v1_20_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_20_11.Validable;
import io.yupiik.kubernetes.bindings.v1_20_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Role implements Validable<Role> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private List<PolicyRule> rules;

    public Role() {
        // no-op
    }

    public Role(final String apiVersion,
                final String kind,
                final ObjectMeta metadata,
                final List<PolicyRule> rules) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public List<PolicyRule> getRules() {
        return rules;
    }

    public void setRules(final List<PolicyRule> rules) {
        this.rules = rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                rules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Role)) {
            return false;
        }
        final Role __otherCasted = (Role) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(rules, __otherCasted.rules);
    }

    public Role apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Role kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Role metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public Role rules(final List<PolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public Role validate() {
        return this;
    }
}
