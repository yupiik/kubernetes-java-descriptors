package io.yupiik.kubernetes.bindings.v1_27_2.v1;

import io.yupiik.kubernetes.bindings.v1_27_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LifecycleHandler implements Validable<LifecycleHandler>, Exportable {
    private ExecAction exec;
    private HTTPGetAction httpGet;
    private TCPSocketAction tcpSocket;

    public LifecycleHandler() {
        // no-op
    }

    public LifecycleHandler(final ExecAction exec,
                            final HTTPGetAction httpGet,
                            final TCPSocketAction tcpSocket) {
        this.exec = exec;
        this.httpGet = httpGet;
        this.tcpSocket = tcpSocket;
    }

    public ExecAction getExec() {
        return exec;
    }

    public void setExec(final ExecAction exec) {
        this.exec = exec;
    }

    public HTTPGetAction getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final HTTPGetAction httpGet) {
        this.httpGet = httpGet;
    }

    public TCPSocketAction getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LifecycleHandler)) {
            return false;
        }
        final LifecycleHandler __otherCasted = (LifecycleHandler) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }

    public LifecycleHandler exec(final ExecAction exec) {
        this.exec = exec;
        return this;
    }

    public LifecycleHandler httpGet(final HTTPGetAction httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public LifecycleHandler tcpSocket(final TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    @Override
    public LifecycleHandler validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (exec != null ? "\"exec\":" + exec.asJson() : ""),
                    (httpGet != null ? "\"httpGet\":" + httpGet.asJson() : ""),
                    (tcpSocket != null ? "\"tcpSocket\":" + tcpSocket.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
