package io.yupiik.kubernetes.bindings.v1_21_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_11.Validable;
import io.yupiik.kubernetes.bindings.v1_21_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodSecurityPolicyList implements Validable<PodSecurityPolicyList> {
    private String apiVersion;
    private List<PodSecurityPolicy> items;
    private String kind;
    private ListMeta metadata;

    public PodSecurityPolicyList() {
        // no-op
    }

    public PodSecurityPolicyList(final String apiVersion,
                                 final List<PodSecurityPolicy> items,
                                 final String kind,
                                 final ListMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<PodSecurityPolicy> getItems() {
        return items;
    }

    public void setItems(final List<PodSecurityPolicy> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ListMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ListMeta metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodSecurityPolicyList)) {
            return false;
        }
        final PodSecurityPolicyList __otherCasted = (PodSecurityPolicyList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public PodSecurityPolicyList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PodSecurityPolicyList items(final List<PodSecurityPolicy> items) {
        this.items = items;
        return this;
    }

    public PodSecurityPolicyList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PodSecurityPolicyList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public PodSecurityPolicyList validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (items == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "items", "items",
                "Missing 'items' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
