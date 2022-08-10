package io.yupiik.kubernetes.bindings.v1_21_13.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_21_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_13.Validable;
import io.yupiik.kubernetes.bindings.v1_21_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeAttachmentList implements Validable<VolumeAttachmentList>, Exportable {
    private String apiVersion;
    private List<VolumeAttachment> items;
    private String kind;
    private ListMeta metadata;

    public VolumeAttachmentList() {
        // no-op
    }

    public VolumeAttachmentList(final String apiVersion,
                                final List<VolumeAttachment> items,
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

    public List<VolumeAttachment> getItems() {
        return items;
    }

    public void setItems(final List<VolumeAttachment> items) {
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
        if (!(__other instanceof VolumeAttachmentList)) {
            return false;
        }
        final VolumeAttachmentList __otherCasted = (VolumeAttachmentList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public VolumeAttachmentList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public VolumeAttachmentList items(final List<VolumeAttachment> items) {
        this.items = items;
        return this;
    }

    public VolumeAttachmentList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public VolumeAttachmentList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public VolumeAttachmentList validate() {
        if (kind == null) {
            kind = "VolumeAttachmentList";
        }
        if (apiVersion == null) {
            apiVersion = "storage.k8s.io/v1alpha1";
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