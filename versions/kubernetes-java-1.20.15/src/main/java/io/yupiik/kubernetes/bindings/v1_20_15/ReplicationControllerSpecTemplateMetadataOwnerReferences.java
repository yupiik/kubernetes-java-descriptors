package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.Objects;

public class ReplicationControllerSpecTemplateMetadataOwnerReferences {
    private String apiVersion;
    private Boolean blockOwnerDeletion;
    private Boolean controller;
    private String kind;
    private String name;
    private String uid;

    public ReplicationControllerSpecTemplateMetadataOwnerReferences() {
        // no-op
    }

    public ReplicationControllerSpecTemplateMetadataOwnerReferences(final String apiVersion,
                                                                    final Boolean blockOwnerDeletion,
                                                                    final Boolean controller,
                                                                    final String kind,
                                                                    final String name,
                                                                    final String uid) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Boolean getBlockOwnerDeletion() {
        return blockOwnerDeletion;
    }

    public void setBlockOwnerDeletion(final Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
    }

    public Boolean getController() {
        return controller;
    }

    public void setController(final Boolean controller) {
        this.controller = controller;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
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
                apiVersion,
                blockOwnerDeletion,
                controller,
                kind,
                name,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpecTemplateMetadataOwnerReferences)) {
            return false;
        }
        final ReplicationControllerSpecTemplateMetadataOwnerReferences __otherCasted = (ReplicationControllerSpecTemplateMetadataOwnerReferences) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(blockOwnerDeletion, __otherCasted.blockOwnerDeletion) &&
            Objects.equals(controller, __otherCasted.controller) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(uid, __otherCasted.uid);
    }
}
