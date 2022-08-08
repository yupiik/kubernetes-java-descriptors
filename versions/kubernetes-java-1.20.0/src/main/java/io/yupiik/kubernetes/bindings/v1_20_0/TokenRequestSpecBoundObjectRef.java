package io.yupiik.kubernetes.bindings.v1_20_0;

import java.util.Objects;

public class TokenRequestSpecBoundObjectRef {
    private String apiVersion;
    private String kind;
    private String name;
    private String uid;

    public TokenRequestSpecBoundObjectRef() {
        // no-op
    }

    public TokenRequestSpecBoundObjectRef(final String apiVersion,
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
                kind,
                name,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof TokenRequestSpecBoundObjectRef)) {
            return false;
        }
        final TokenRequestSpecBoundObjectRef __otherCasted = (TokenRequestSpecBoundObjectRef) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(uid, __otherCasted.uid);
    }
}
