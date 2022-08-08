package io.yupiik.kubernetes.bindings.v1_9_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_9_5.Validable;
import io.yupiik.kubernetes.bindings.v1_9_5.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CertificateSigningRequestSpec implements Validable<CertificateSigningRequestSpec> {
    private JsonObject extra;
    private List<String> groups;
    private String request;
    private String uid;
    private List<String> usages;
    private String username;

    public CertificateSigningRequestSpec() {
        // no-op
    }

    public CertificateSigningRequestSpec(final JsonObject extra,
                                         final List<String> groups,
                                         final String request,
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
        return Objects.equals(extra, __otherCasted.extra) &&
            Objects.equals(groups, __otherCasted.groups) &&
            Objects.equals(request, __otherCasted.request) &&
            Objects.equals(uid, __otherCasted.uid) &&
            Objects.equals(usages, __otherCasted.usages) &&
            Objects.equals(username, __otherCasted.username);
    }

    public CertificateSigningRequestSpec extra(final JsonObject extra) {
        this.extra = extra;
        return this;
    }

    public CertificateSigningRequestSpec groups(final List<String> groups) {
        this.groups = groups;
        return this;
    }

    public CertificateSigningRequestSpec request(final String request) {
        this.request = request;
        return this;
    }

    public CertificateSigningRequestSpec uid(final String uid) {
        this.uid = uid;
        return this;
    }

    public CertificateSigningRequestSpec usages(final List<String> usages) {
        this.usages = usages;
        return this;
    }

    public CertificateSigningRequestSpec username(final String username) {
        this.username = username;
        return this;
    }

    @Override
    public CertificateSigningRequestSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (request == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "request", "request",
                "Missing 'request' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
