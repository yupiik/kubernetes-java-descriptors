package io.yupiik.kubernetes.bindings.v1_28_3.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_28_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_28_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ValidatingAdmissionPolicyList implements Validable<ValidatingAdmissionPolicyList>, Exportable {
    private String apiVersion;
    private List<ValidatingAdmissionPolicy> items;
    private String kind;
    private ListMeta metadata;

    public ValidatingAdmissionPolicyList() {
        // no-op
    }

    public ValidatingAdmissionPolicyList(final String apiVersion,
                                         final List<ValidatingAdmissionPolicy> items,
                                         final String kind,
                                         final ListMeta metadata) {
        this.apiVersion = apiVersion;
        this.items = items;
        this.kind = kind;
        this.metadata = metadata;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ValidatingAdmissionPolicy> getItems() {
        return items;
    }

    public void setItems(final List<ValidatingAdmissionPolicy> items) {
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
        if (!(__other instanceof ValidatingAdmissionPolicyList)) {
            return false;
        }
        final ValidatingAdmissionPolicyList __otherCasted = (ValidatingAdmissionPolicyList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public ValidatingAdmissionPolicyList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ValidatingAdmissionPolicyList items(final List<ValidatingAdmissionPolicy> items) {
        this.items = items;
        return this;
    }

    public ValidatingAdmissionPolicyList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ValidatingAdmissionPolicyList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public ValidatingAdmissionPolicyList validate() {
        if (kind == null) {
            kind = "ValidatingAdmissionPolicyList";
        }
        if (apiVersion == null) {
            apiVersion = "admissionregistration.k8s.io/v1alpha1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (items != null ? "\"items\":" + items.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
