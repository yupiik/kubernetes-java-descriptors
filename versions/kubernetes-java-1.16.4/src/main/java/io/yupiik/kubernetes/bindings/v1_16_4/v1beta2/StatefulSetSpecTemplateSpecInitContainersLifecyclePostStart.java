package io.yupiik.kubernetes.bindings.v1_16_4.v1beta2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart {
    private StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart(final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                       final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                       final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (StatefulSetSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
