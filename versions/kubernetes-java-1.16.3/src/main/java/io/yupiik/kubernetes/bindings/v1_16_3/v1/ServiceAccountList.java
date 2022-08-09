package io.yupiik.kubernetes.bindings.v1_16_3.v1;

import io.yupiik.kubernetes.bindings.v1_16_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_16_3.Validable;
import io.yupiik.kubernetes.bindings.v1_16_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceAccountList implements Validable<ServiceAccountList>, Exportable {
    private String apiVersion;
    private List<ServiceAccount> items;
    private String kind;
    private ListMeta metadata;

    public ServiceAccountList() {
        // no-op
    }

    public ServiceAccountList(final String apiVersion,
                              final List<ServiceAccount> items,
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

    public List<ServiceAccount> getItems() {
        return items;
    }

    public void setItems(final List<ServiceAccount> items) {
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
        if (!(__other instanceof ServiceAccountList)) {
            return false;
        }
        final ServiceAccountList __otherCasted = (ServiceAccountList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public ServiceAccountList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ServiceAccountList items(final List<ServiceAccount> items) {
        this.items = items;
        return this;
    }

    public ServiceAccountList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ServiceAccountList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public ServiceAccountList validate() {
        if (kind == null) {
            kind = "ServiceAccountList";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
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
