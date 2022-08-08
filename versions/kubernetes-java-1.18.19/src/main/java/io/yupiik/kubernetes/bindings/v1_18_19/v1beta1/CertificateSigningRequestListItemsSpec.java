package io.yupiik.kubernetes.bindings.v1_18_19.v1beta1;

import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;

public class CertificateSigningRequestListItemsSpec {
    private JsonObject extra;
    private List<String> groups;
    private String request;
    private String signerName;
    private String uid;
    private List<String> usages;
    private String username;

    public CertificateSigningRequestListItemsSpec() {
        // no-op
    }

    public CertificateSigningRequestListItemsSpec(final JsonObject extra,
                                                  final List<String> groups,
                                                  final String request,
                                                  final String signerName,
                                                  final String uid,
                                                  final List<String> usages,
                                                  final String username) {
        // no-op
    }

    public JsonObject getExtra() {
        return extra;
    }

    public void setExtra(final JsonObject extra) {
        this.extra = extra;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(final List<String> groups) {
        this.groups = groups;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(final String request) {
        this.request = request;
    }

    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(final String signerName) {
        this.signerName = signerName;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    public List<String> getUsages() {
        return usages;
    }

    public void setUsages(final List<String> usages) {
        this.usages = usages;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                extra,
                groups,
                request,
                signerName,
                uid,
                usages,
                username);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CertificateSigningRequestListItemsSpec)) {
            return false;
        }
        final CertificateSigningRequestListItemsSpec __otherCasted = (CertificateSigningRequestListItemsSpec) __other;
        return Objects.equals(extra, __otherCasted.extra) &&
            Objects.equals(groups, __otherCasted.groups) &&
            Objects.equals(request, __otherCasted.request) &&
            Objects.equals(signerName, __otherCasted.signerName) &&
            Objects.equals(uid, __otherCasted.uid) &&
            Objects.equals(usages, __otherCasted.usages) &&
            Objects.equals(username, __otherCasted.username);
    }
}
