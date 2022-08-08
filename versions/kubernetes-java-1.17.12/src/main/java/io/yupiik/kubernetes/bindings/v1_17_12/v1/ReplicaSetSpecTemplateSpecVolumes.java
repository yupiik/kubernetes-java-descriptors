package io.yupiik.kubernetes.bindings.v1_17_12.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumes {
    private ReplicaSetSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private ReplicaSetSpecTemplateSpecVolumesAzureDisk azureDisk;
    private ReplicaSetSpecTemplateSpecVolumesAzureFile azureFile;
    private ReplicaSetSpecTemplateSpecVolumesCephfs cephfs;
    private ReplicaSetSpecTemplateSpecVolumesCinder cinder;
    private ReplicaSetSpecTemplateSpecVolumesConfigMap configMap;
    private ReplicaSetSpecTemplateSpecVolumesCsi csi;
    private ReplicaSetSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private ReplicaSetSpecTemplateSpecVolumesEmptyDir emptyDir;
    private ReplicaSetSpecTemplateSpecVolumesFc fc;
    private ReplicaSetSpecTemplateSpecVolumesFlexVolume flexVolume;
    private ReplicaSetSpecTemplateSpecVolumesFlocker flocker;
    private ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private ReplicaSetSpecTemplateSpecVolumesGitRepo gitRepo;
    private ReplicaSetSpecTemplateSpecVolumesGlusterfs glusterfs;
    private ReplicaSetSpecTemplateSpecVolumesHostPath hostPath;
    private ReplicaSetSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private ReplicaSetSpecTemplateSpecVolumesNfs nfs;
    private ReplicaSetSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private ReplicaSetSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private ReplicaSetSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private ReplicaSetSpecTemplateSpecVolumesProjected projected;
    private ReplicaSetSpecTemplateSpecVolumesQuobyte quobyte;
    private ReplicaSetSpecTemplateSpecVolumesRbd rbd;
    private ReplicaSetSpecTemplateSpecVolumesScaleIO scaleIO;
    private ReplicaSetSpecTemplateSpecVolumesSecret secret;
    private ReplicaSetSpecTemplateSpecVolumesStorageos storageos;
    private ReplicaSetSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public ReplicaSetSpecTemplateSpecVolumes() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumes(final ReplicaSetSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                             final ReplicaSetSpecTemplateSpecVolumesAzureDisk azureDisk,
                                             final ReplicaSetSpecTemplateSpecVolumesAzureFile azureFile,
                                             final ReplicaSetSpecTemplateSpecVolumesCephfs cephfs,
                                             final ReplicaSetSpecTemplateSpecVolumesCinder cinder,
                                             final ReplicaSetSpecTemplateSpecVolumesConfigMap configMap,
                                             final ReplicaSetSpecTemplateSpecVolumesCsi csi,
                                             final ReplicaSetSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                             final ReplicaSetSpecTemplateSpecVolumesEmptyDir emptyDir,
                                             final ReplicaSetSpecTemplateSpecVolumesFc fc,
                                             final ReplicaSetSpecTemplateSpecVolumesFlexVolume flexVolume,
                                             final ReplicaSetSpecTemplateSpecVolumesFlocker flocker,
                                             final ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                             final ReplicaSetSpecTemplateSpecVolumesGitRepo gitRepo,
                                             final ReplicaSetSpecTemplateSpecVolumesGlusterfs glusterfs,
                                             final ReplicaSetSpecTemplateSpecVolumesHostPath hostPath,
                                             final ReplicaSetSpecTemplateSpecVolumesIscsi iscsi,
                                             final String name,
                                             final ReplicaSetSpecTemplateSpecVolumesNfs nfs,
                                             final ReplicaSetSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                             final ReplicaSetSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                             final ReplicaSetSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                             final ReplicaSetSpecTemplateSpecVolumesProjected projected,
                                             final ReplicaSetSpecTemplateSpecVolumesQuobyte quobyte,
                                             final ReplicaSetSpecTemplateSpecVolumesRbd rbd,
                                             final ReplicaSetSpecTemplateSpecVolumesScaleIO scaleIO,
                                             final ReplicaSetSpecTemplateSpecVolumesSecret secret,
                                             final ReplicaSetSpecTemplateSpecVolumesStorageos storageos,
                                             final ReplicaSetSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final ReplicaSetSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public ReplicaSetSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final ReplicaSetSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public ReplicaSetSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final ReplicaSetSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public ReplicaSetSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final ReplicaSetSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public ReplicaSetSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final ReplicaSetSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public ReplicaSetSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ReplicaSetSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public ReplicaSetSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final ReplicaSetSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public ReplicaSetSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final ReplicaSetSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public ReplicaSetSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final ReplicaSetSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public ReplicaSetSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final ReplicaSetSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public ReplicaSetSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final ReplicaSetSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public ReplicaSetSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final ReplicaSetSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final ReplicaSetSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public ReplicaSetSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final ReplicaSetSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public ReplicaSetSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final ReplicaSetSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public ReplicaSetSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final ReplicaSetSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public ReplicaSetSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final ReplicaSetSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ReplicaSetSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final ReplicaSetSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public ReplicaSetSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final ReplicaSetSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public ReplicaSetSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final ReplicaSetSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public ReplicaSetSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final ReplicaSetSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public ReplicaSetSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final ReplicaSetSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public ReplicaSetSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final ReplicaSetSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public ReplicaSetSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final ReplicaSetSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public ReplicaSetSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final ReplicaSetSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public ReplicaSetSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final ReplicaSetSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public ReplicaSetSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final ReplicaSetSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public ReplicaSetSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final ReplicaSetSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumes)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumes __otherCasted = (ReplicaSetSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
