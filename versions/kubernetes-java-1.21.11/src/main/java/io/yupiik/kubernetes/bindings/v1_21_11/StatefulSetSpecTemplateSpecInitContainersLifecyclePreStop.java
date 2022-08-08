package io.yupiik.kubernetes.bindings.v1_21_11;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop {
    private StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop(final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                     final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                     final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (StatefulSetSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
