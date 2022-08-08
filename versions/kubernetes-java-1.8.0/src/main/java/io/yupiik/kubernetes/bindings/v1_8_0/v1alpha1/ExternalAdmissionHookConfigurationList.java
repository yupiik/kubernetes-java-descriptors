package io.yupiik.kubernetes.bindings.v1_8_0.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_8_0.Validable;
import io.yupiik.kubernetes.bindings.v1_8_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExternalAdmissionHookConfigurationList implements Validable<ExternalAdmissionHookConfigurationList> {
    private String apiVersion;
    private List<ExternalAdmissionHookConfiguration> items;
    private String kind;
    private ListMeta metadata;

    public ExternalAdmissionHookConfigurationList() {
        // no-op
    }

    public ExternalAdmissionHookConfigurationList(final String apiVersion,
                                                  final List<ExternalAdmissionHookConfiguration> items,
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

    public List<ExternalAdmissionHookConfiguration> getItems() {
        return items;
    }

    public void setItems(final List<ExternalAdmissionHookConfiguration> items) {
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
        if (!(__other instanceof ExternalAdmissionHookConfigurationList)) {
            return false;
        }
        final ExternalAdmissionHookConfigurationList __otherCasted = (ExternalAdmissionHookConfigurationList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public ExternalAdmissionHookConfigurationList apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ExternalAdmissionHookConfigurationList items(final List<ExternalAdmissionHookConfiguration> items) {
        this.items = items;
        return this;
    }

    public ExternalAdmissionHookConfigurationList kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ExternalAdmissionHookConfigurationList metadata(final ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public ExternalAdmissionHookConfigurationList validate() {
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
