package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import java.util.Objects;

public class PodSpecVolumes {
    private PodSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private PodSpecVolumesAzureDisk azureDisk;
    private PodSpecVolumesAzureFile azureFile;
    private PodSpecVolumesCephfs cephfs;
    private PodSpecVolumesCinder cinder;
    private PodSpecVolumesConfigMap configMap;
    private PodSpecVolumesCsi csi;
    private PodSpecVolumesDownwardAPI downwardAPI;
    private PodSpecVolumesEmptyDir emptyDir;
    private PodSpecVolumesEphemeral ephemeral;
    private PodSpecVolumesFc fc;
    private PodSpecVolumesFlexVolume flexVolume;
    private PodSpecVolumesFlocker flocker;
    private PodSpecVolumesGcePersistentDisk gcePersistentDisk;
    private PodSpecVolumesGitRepo gitRepo;
    private PodSpecVolumesGlusterfs glusterfs;
    private PodSpecVolumesHostPath hostPath;
    private PodSpecVolumesIscsi iscsi;
    private String name;
    private PodSpecVolumesNfs nfs;
    private PodSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private PodSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private PodSpecVolumesPortworxVolume portworxVolume;
    private PodSpecVolumesProjected projected;
    private PodSpecVolumesQuobyte quobyte;
    private PodSpecVolumesRbd rbd;
    private PodSpecVolumesScaleIO scaleIO;
    private PodSpecVolumesSecret secret;
    private PodSpecVolumesStorageos storageos;
    private PodSpecVolumesVsphereVolume vsphereVolume;

    public PodSpecVolumes() {
        // no-op
    }

    public PodSpecVolumes(final PodSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                          final PodSpecVolumesAzureDisk azureDisk,
                          final PodSpecVolumesAzureFile azureFile,
                          final PodSpecVolumesCephfs cephfs,
                          final PodSpecVolumesCinder cinder,
                          final PodSpecVolumesConfigMap configMap,
                          final PodSpecVolumesCsi csi,
                          final PodSpecVolumesDownwardAPI downwardAPI,
                          final PodSpecVolumesEmptyDir emptyDir,
                          final PodSpecVolumesEphemeral ephemeral,
                          final PodSpecVolumesFc fc,
                          final PodSpecVolumesFlexVolume flexVolume,
                          final PodSpecVolumesFlocker flocker,
                          final PodSpecVolumesGcePersistentDisk gcePersistentDisk,
                          final PodSpecVolumesGitRepo gitRepo,
                          final PodSpecVolumesGlusterfs glusterfs,
                          final PodSpecVolumesHostPath hostPath,
                          final PodSpecVolumesIscsi iscsi,
                          final String name,
                          final PodSpecVolumesNfs nfs,
                          final PodSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                          final PodSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                          final PodSpecVolumesPortworxVolume portworxVolume,
                          final PodSpecVolumesProjected projected,
                          final PodSpecVolumesQuobyte quobyte,
                          final PodSpecVolumesRbd rbd,
                          final PodSpecVolumesScaleIO scaleIO,
                          final PodSpecVolumesSecret secret,
                          final PodSpecVolumesStorageos storageos,
                          final PodSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public PodSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final PodSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public PodSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final PodSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public PodSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final PodSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public PodSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final PodSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public PodSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final PodSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public PodSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final PodSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public PodSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final PodSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public PodSpecVolumesEphemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(final PodSpecVolumesEphemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    public PodSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final PodSpecVolumesFc fc) {
        this.fc = fc;
    }

    public PodSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final PodSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public PodSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final PodSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public PodSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final PodSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public PodSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final PodSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public PodSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final PodSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public PodSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final PodSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public PodSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final PodSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PodSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final PodSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public PodSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final PodSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public PodSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final PodSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public PodSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final PodSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public PodSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final PodSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public PodSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final PodSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public PodSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final PodSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public PodSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final PodSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public PodSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public PodSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final PodSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public PodSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final PodSpecVolumesVsphereVolume vsphereVolume) {
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
                ephemeral,
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
        if (!(__other instanceof PodSpecVolumes)) {
            return false;
        }
        final PodSpecVolumes __otherCasted = (PodSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(ephemeral, __otherCasted.ephemeral) &&
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
