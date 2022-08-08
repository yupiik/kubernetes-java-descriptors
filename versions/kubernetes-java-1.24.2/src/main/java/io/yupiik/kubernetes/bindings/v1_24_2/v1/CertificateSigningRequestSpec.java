package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import jakarta.json.JsonObject;
import java.util.List;
import java.util.Objects;

public class CertificateSigningRequestSpec {
    private Integer expirationSeconds;
    private JsonObject extra;
    private List<String> groups;
    private String request;
    private String signerName;
    private String uid;
    private List<String> usages;
    private String username;

    public CertificateSigningRequestSpec() {
        // no-op
    }

    public CertificateSigningRequestSpec(final Integer expirationSeconds,
                                         final JsonObject extra,
                                         final List<String> groups,
                                         final String request,
                                         final String signerName,
                                         final String uid,
                                         final List<String> usages,
                                         final String username) {
        // no-op
    }

    public Integer getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
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
                expirationSeconds,
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
        if (!(__other instanceof CertificateSigningRequestSpec)) {
            return false;
        }
        final CertificateSigningRequestSpec __otherCasted = (CertificateSigningRequestSpec) __other;
        return Objects.equals(expirationSeconds, __otherCasted.expirationSeconds) &&
            Objects.equals(extra, __otherCasted.extra) &&
            Objects.equals(groups, __otherCasted.groups) &&
            Objects.equals(request, __otherCasted.request) &&
            Objects.equals(signerName, __otherCasted.signerName) &&
            Objects.equals(uid, __otherCasted.uid) &&
            Objects.equals(usages, __otherCasted.usages) &&
            Objects.equals(username, __otherCasted.username);
    }
}
