package io.yupiik.kubernetes.bindings.v1_27_3.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_27_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_3.Validable;
import io.yupiik.kubernetes.bindings.v1_27_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimTemplateList implements Validable<ResourceClaimTemplateList>, Exportable {
    private String apiVersion;
    private List<ResourceClaimTemplate> items;
    private String kind;
    private ListMeta metadata;

    public ResourceClaimTemplateList() {
        // no-op
    }

    public ResourceClaimTemplateList(final String apiVersion,
                                     final List<ResourceClaimTemplate> items,
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

    public List<ResourceClaimTemplate> getItems() {
        return items;
    }

    public void setItems(final List<ResourceClaimTemplate> items) {
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
        if (!(__other instanceof ResourceClaimTemplateList)) {
            return false;
        }
        final ResourceClaimTemplateList __otherCasted = (ResourceClaimTemplateList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public ResourceClaimTemplateList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ResourceClaimTemplateList items(final List<ResourceClaimTemplate> items) {
        this.items = items;
        return this;
    }

    public ResourceClaimTemplateList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ResourceClaimTemplateList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public ResourceClaimTemplateList validate() {
        if (kind == null) {
            kind = "ResourceClaimTemplateList";
        }
        if (apiVersion == null) {
            apiVersion = "resource.k8s.io/v1alpha2";
        }
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
