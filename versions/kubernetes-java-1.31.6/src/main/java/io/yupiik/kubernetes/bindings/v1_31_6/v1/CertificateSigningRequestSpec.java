package io.yupiik.kubernetes.bindings.v1_31_6.v1;

import io.yupiik.kubernetes.bindings.v1_31_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_6.Validable;
import io.yupiik.kubernetes.bindings.v1_31_6.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CertificateSigningRequestSpec implements Validable<CertificateSigningRequestSpec>, Exportable {
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
        this.expirationSeconds = expirationSeconds;
        this.extra = extra;
        this.groups = groups;
        this.request = request;
        this.signerName = signerName;
        this.uid = uid;
        this.usages = usages;
        this.username = username;
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

    public CertificateSigningRequestSpec expirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
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

    public CertificateSigningRequestSpec signerName(final String signerName) {
        this.signerName = signerName;
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
        if (signerName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "signerName", "signerName",
                "Missing 'signerName' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (expirationSeconds != null ? "\"expirationSeconds\":" + expirationSeconds : ""),
                    (extra != null ? "\"extra\":" + extra : ""),
                    (groups != null ? "\"groups\":" + groups.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (request != null ? "\"request\":\"" +  JsonStrings.escapeJson(request) + "\"" : ""),
                    (signerName != null ? "\"signerName\":\"" +  JsonStrings.escapeJson(signerName) + "\"" : ""),
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""),
                    (usages != null ? "\"usages\":" + usages.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (username != null ? "\"username\":\"" +  JsonStrings.escapeJson(username) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
