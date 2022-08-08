package io.yupiik.kubernetes.bindings.v1_14_0.v1beta1;

import java.util.Objects;

public class PriorityClassListItems {
    private String apiVersion;
    private String description;
    private Boolean globalDefault;
    private String kind;
    private PriorityClassListItemsMetadata metadata;
    private int value;

    public PriorityClassListItems() {
        // no-op
    }

    public PriorityClassListItems(final String apiVersion,
                                  final String description,
                                  final Boolean globalDefault,
                                  final String kind,
                                  final PriorityClassListItemsMetadata metadata,
                                  final int value) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Boolean getGlobalDefault() {
        return globalDefault;
    }

    public void setGlobalDefault(final Boolean globalDefault) {
        this.globalDefault = globalDefault;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public PriorityClassListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PriorityClassListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                description,
                globalDefault,
                kind,
                metadata,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityClassListItems)) {
            return false;
        }
        final PriorityClassListItems __otherCasted = (PriorityClassListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(description, __otherCasted.description) &&
            Objects.equals(globalDefault, __otherCasted.globalDefault) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(value, __otherCasted.value);
    }
}
